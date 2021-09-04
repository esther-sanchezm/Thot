# Thot - Character rol application
Application for management of fantasy conventional lore. The domain is divided in five principal blocks: 
- ``History`` principal for all lore. Maybe something like mithology information or important civil war.
- ``Character`` it can be related with race and character blocks.
- ``Magic`` some authors said that principal different between fantasy and science fiction are that point.
- ``Race`` 

## Architecture

### Backend
Convenctional two layer:
- **Repository**: this is for database access. I used mongoDB because is more addecuated to save large text like history or something like that. The tecnology stack includes:
  - _Spring Data MongoDB_ : for access to mongo. 
- **Controller**: expose layer of operations. I use REST because it's the more popular tecnology for expose operations:
  - _Spring Web_: for specify REST operations.
  - _Spring Validator_: because I like validated the input of system.
  - _Spring Security_: //TODO. Maybe someday is a interesting thing to add. 
  - _Spring Fox_

Unless conventional I added boot layer, the functionality of that layer is basic initialization of application and some transversal configurations. The tecnology stack includes:
  - _Spring AOP_

### Frontend

//TODO

## Application Programming Interface
//TODO


