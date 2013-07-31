See below for the issue

```
[ianhummel@@mm-hummel-mbp akka-camel-example]$ sbt run
[info] Loading global plugins from /Users/ianhummel/.sbt/plugins
[info] Set current project to default-4c29a7 (in build file:/Users/ianhummel/Juno/akka-camel-example/)
[info] Compiling 1 Scala source to /Users/ianhummel/Juno/akka-camel-example/target/scala-2.10/classes...
[info] Running ExampleActor 
14:57:58.359 [default-akka.actor.default-dispatcher-3] DEBUG o.a.c.i.c.AnnotationTypeConverterLoader - Found 3 packages with 15 @Converter classes to load
14:57:58.399 [default-akka.actor.default-dispatcher-3] DEBUG o.a.c.i.c.AnnotationTypeConverterLoader - Loading file META-INF/services/org/apache/camel/TypeConverter to retrieve list of packages, from url: jar:file:/Users/ianhummel/.ivy2/cache/org.apache.camel/camel-core/bundles/camel-core-2.10.3.jar!/META-INF/services/org/apache/camel/TypeConverter
14:57:58.402 [default-akka.actor.default-dispatcher-3] DEBUG o.a.c.i.c.AnnotationTypeConverterLoader - No additional package names found in classpath for annotated type converters.
14:57:58.403 [default-akka.actor.default-dispatcher-3] INFO  o.a.c.i.c.DefaultTypeConverter - Loaded 172 type converters
14:57:58.405 [default-akka.actor.default-dispatcher-3] INFO  o.a.camel.impl.DefaultCamelContext - Apache Camel 2.10.3 (CamelContext: default) is starting
14:57:58.406 [default-akka.actor.default-dispatcher-3] INFO  o.a.camel.impl.DefaultCamelContext - StreamCaching is enabled on CamelContext: default
14:57:58.409 [default-akka.actor.default-dispatcher-3] INFO  o.a.c.m.ManagementStrategyFactory - JMX is disabled.
14:57:58.422 [default-akka.actor.default-dispatcher-3] DEBUG o.a.c.impl.SharedProducerServicePool - Starting service pool: org.apache.camel.impl.SharedProducerServicePool@6b10bc5c
14:57:58.427 [default-akka.actor.default-dispatcher-3] INFO  o.a.camel.impl.DefaultCamelContext - Total 0 routes, of which 0 is started.
14:57:58.428 [default-akka.actor.default-dispatcher-3] INFO  o.a.camel.impl.DefaultCamelContext - Apache Camel 2.10.3 (CamelContext: default) started in 0.022 seconds
14:57:58.450 [default-akka.actor.default-dispatcher-5] DEBUG o.a.camel.impl.DefaultCamelContext - Adding routes from builder: Routes: []
14:57:58.502 [default-akka.actor.default-dispatcher-5] DEBUG o.a.c.impl.DefaultComponentResolver - Found component: file in registry: null
14:57:58.504 [default-akka.actor.default-dispatcher-5] DEBUG o.a.c.impl.DefaultComponentResolver - Found component: file via type: org.apache.camel.component.file.FileComponent via: META-INF/services/org/apache/camel/component/file
14:57:58.512 [default-akka.actor.default-dispatcher-5] DEBUG o.apache.camel.impl.DefaultComponent - Creating endpoint uri=[file://inbox], path=[inbox], parameters=[{}]
14:57:58.528 [default-akka.actor.default-dispatcher-5] DEBUG o.a.camel.impl.DefaultCamelContext - file://inbox converted to endpoint: Endpoint[file://inbox] by component: org.apache.camel.component.file.FileComponent@6ae441ee
14:57:58.566 [default-akka.actor.default-dispatcher-5] DEBUG o.a.c.p.interceptor.DefaultChannel - Initialize channel for target: 'ConvertBodyTo[java.io.InputStream]'
[WARN] [07/31/2013 14:57:58.615] [default-akka.actor.default-dispatcher-5] [akka://default/user/camel-supervisor/registry/consumerRegistrar] Actor [Actor[akka://default/user/$a#-683291242]] failed to activate
```