# kotlin-example-websockets

[ws://localhost:8080/ws/primes](ws://localhost:8080/ws/primes)

Example of using Kotlin to create a WebSockets API

`gradlew bootRun`

Then, open `index.html` multiple times.

Each site guesses numbers and sends them to the server, which, if a guessed number is a prime number, broadcasts that to alle clients. 