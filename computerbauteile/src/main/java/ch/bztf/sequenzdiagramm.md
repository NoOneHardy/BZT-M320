@startuml Computerbauteile
!theme mars

participant "Main"

create "A:Disk"
"Main" -> "A:Disk" : new
create "B:Disk"
"Main" -> "B:Disk" : new
create "cA:PC"
"Main" -> "cA:PC" : new(A)

"Main" -> "cA:PC" : diskWechseln(B)
activate "cA:PC"
alt disk in Verwendung

"cA:PC" -> "A:Disk" : ausbauen
"cA:PC" -> "B:Disk" : einbauen

end

@enduml