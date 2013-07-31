import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor.ActorLogging
import akka.camel.Consumer
import akka.camel.CamelMessage
import org.apache.camel.model.RouteDefinition
import org.apache.camel.builder.Builder
import org.apache.camel.processor.idempotent.FileIdempotentRepository
import java.io.File

class ExampleActor extends Consumer with ActorLogging {
	def endpointUri = "file://inbox"

	override def onRouteDefinition = {
		(rd) => rd.idempotentConsumer(
			Builder.header("CamelFilePath"), 
			FileIdempotentRepository.fileIdempotentRepository(new File("status"))
		).end
	}

	def receive = {
		case msg: CamelMessage => {
			log.info("Received message {}", msg)
		}
	}
}

object ExampleActor extends App {
	val system = ActorSystem()
	system.actorOf(Props[ExampleActor])
	system.awaitTermination
}