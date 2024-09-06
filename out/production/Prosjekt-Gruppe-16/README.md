Prosjekt:
	I dette prosjektet skal dere lage en prosjektdokumentasjon og en prototype for et produkt for en oppstartsbedrift.
	Denne oppstartsbedriften (kunden deres) ønsker å få laget en løsning som gjør det mulig for hvermannsen (brukeren) å benytte seg av teknologiske smarte komponenter i sine hjem.
	Oppstartsbedriften har imidlertid ingen egen, intern IT-kompetanse, men ønsker et forlsag for hvordan et slikt system kan være og hva det skal inneholde.
	Dere skal beskrive kjernesystemet og miljøet rundt, samt definere hvilke funksjoner som er påkrevd for at oppstartsbedriften (kunden) får det systemet de etterspør.
	I tillegg skal det utvikles en prototype (et MVP) som implementerer et utvalg av funksjonene i systemet. Dere velger selv hvilke hovedfunksjoner dere vil vise frem i prototypen, så lenge prototypen har et visst omfang og vil kunne ha verdi for kunden.
	Det skal også lages nødvendige, automatiserte tester som dokumenterer at prototypen tilfredsstiller de viktigste kravene som dere har avdekket og som blir beskrevet i dokumentasjonen dere skal produsere for systemet.
	Det er viktig at dere passer på å dokumentere eksterne avhengigheter i systemet, dvs. der systemet må prate med systemer fra andre tjenesteleverandører (f.eks. betalingsløsning). 
	Dere skal IKKE integrere mot noen eksterne leverandører i prototypen, men bør skrive små «stubs» som gir dere muligheten til å teste funksjoner som avhenger av dem.


Fritt valg av språk og rammeverk:
	Det kan være hensiktsmessig å velge noe mange på gruppa kan hjelpe til med.
	Husk også at studassene ikke nødvendigvis kan hjelpe med detaljer i alle språk og rammeverk.
	Spør studassene på forhånd om dere er usikre og tror dere kommer til å trenge mye teknisk hjelp underveis!
 

TIPS:
	Husk at dokumentasjonen skal være forståelig for personer uten inngående kunnskap om fagområdet eller programmering!
	Implementasjonsdetaljer har sjelden noen plass i prosjektdokumentasjonen!
	Bruk diagrammer og modeller der det er relevant for å gjøre ting mer forståelig!
	Informasjon om prototypen i prosjektdokumentasjonen bør sjelden være mer enn et par-tre sider, prototypen i seg selv bør være selvforklarende!


Innlevering:	
•	Prosjektdokumentasjon:
Beskrivelsen av systemet, slik som forslag til arkitektur, krav, teknologier. Alt skal være dokumentert på et hensiktsmessig nivå med tanke på bruk.
•	Prototype :
Dere skal levere en fungerende prototype av det dere mener er en viktig del av systemet. Prototypen skal inneholde nødvendige tester for å vise at kravene i dokumentasjonen er oppfylt.


Innlevering forts:
	Kildekoden til prototypen skal leveres som et Git-repository som viser utviklingen av prototypen over prosjektperioden. Pass på at .git-mappen blir med i innleveringen deres, og at dere har committet alle endringene før dere leverer. 
	Sørg for at det er beskrevet hvordan en person uten dyptgående IT-kunnskap kan bygge, kjøre og teste prototypen deres.
	Avhengigheter i applikasjonen deres skal kunne installeres automatisk ved hjelp av et pakkesystem for språket eller rammeverket dere benytter (f.eks. maven eller gradle om dere bruker Java, eller pip eller poetry for Python).
