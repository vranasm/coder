# coder
Concept proof Spring Boot application - string encode and decode application

Backend
_______________

Written in Java Spring Boot, simple RestController with access points:

@GetMapping(path = "/api/coders") - gets list of all coders

@GetMapping(path = "/api/coders/{coder}/direct") - gets coding page for Alphabet coders (returns JSON in the form of key-value)

@GetMapping(path = "/api/coders/{coder}/reverse") - gets decoding (reverse) page for Alphabet coders (retusn JSON in the form of key-value)

@GetMapping(path = "/api/coders/{coder}/advice") - gets advice for coding, since initial implementations is Morse alphabet the advice is based on czech words, for example A - Akát (.-)

@PostMapping(path = "/api/coders/{coder}/encode") - returns encoded string 

@PostMapping(path = "/api/coders/{coder}/decode") - returns decoded string

_______________
Frontend
_______________

Written in Vue.js (npm webpack). Very simplistic look, mostly as proof of concept.
After clone you need to run "npm install" in frontend directory to inicialize project.

Communicates with full path (requests are http://localhost...) for easier debugging. Should be replaced in release with relative paths.

_______________
Development SW
_______________
Java Spring Boot, Vue.js frameworks.

Netbeans 8.0.2 + 1.8 JDK.

Microsoft Studio Code for Vue.js (could be written even in notepad since compiling is done with npm).
