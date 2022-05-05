# Build Scala Message Broker
• The workers need to be load balanced in a round robin fashion;

• Occasionally, events will contain a “kill message”. These should crash the worker receiving said message;

• The worker pool needs to be supervised and a restart policy enforced upon them;

• After receiving a task, a worker should sleep for 50ms to 500ms, distributed normally;

• The system should provide logs about starting / stopping / auto-scaling / load balancing workers and should print processed tweets.
### PTR_Lab01
[1] Cameron Currie. ”EventsourceEx”. https://github.com/cwc/eventsource_ex

[2] Tony Allen. ”Examining Load Balancing Algorithms with Envoy”. https://blog. envoyproxy.io/examining-load-balancing-algorithms-with-envoy-1be643ea121c

[3] Frederic Trottier-Hebert. ”Learn you some Erlang”. https://learnyousomeerlang.com/ content.

[4] Giovanni Cappellotto et al. ”Learn X in Y minutes Where X=erlang”. https:// learnxinyminutes.com/docs/erlang/.

[5] The Elixir Team. ”Getting Started. Introduction”. https://elixir-lang.org/ getting-started/introduction.html.

[6] Joao Marques et al. ”Learn X in Y minutes Where X=elixir”. https://learnxinyminutes.

com/docs/elixir/.

[7] @stevej et al. ”Scala School!”. http://twitter.github.io/scala_school/.

[8] Lightbend. ”Overview of Akka libraries and modules”. https://doc.akka.io/docs/akka/ current/typed/guide/modules.html.

[9] cbeams. ”How to Write a Git Commit Message”. https://cbea.ms/git-commit/

[10] Danny Guo. ”Make a README”. https://www.makeareadme.com/

[11] Rosetta Code. ”Documentation”. https://rosettacode.org/wiki/Documentation

[12] Google. ”Google Style Guides”. https://google.github.io/styleguide/

### PTR_Lab03

[1] Gregor Hohpe, Bobby Woolf. ”Messaging Patterns”. https://www.enterpriseintegrationpatterns.com/patterns/messaging/index.html