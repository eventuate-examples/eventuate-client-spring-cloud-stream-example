# Example application for the Eventuate Binder for Spring Cloud Stream

This is a simple application that illustrates how to use the [Eventuate Binder for Spring Cloud Stream](https://github.com/eventuate-clients/eventuate-client-spring-cloud-stream).
The Eventuate Binder enables a [Spring Cloud Stream application](https://cloud.spring.io/spring-cloud-stream/) to consume events published by the [Eventuate event store](http://eventuate.io/).

This application consumes events that are published by the [Money Transfer example application](https://github.com/cer/event-sourcing-examples) so you will need to build and run that application as well.

To run this application you need to configure the following properties: `eventuate.api.key.id`, `eventuate.api.key.secret`.
These are the credentials that you received when you [signed up for Eventuate](https://signup.eventuate.io/).
