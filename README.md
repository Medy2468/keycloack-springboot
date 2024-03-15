SPRING BOOT API REST WITH KEYCLOAK

CONFIGURATION DE KEYCLOAK


* CREATION DU CONTAINER A PARTIR DU FICHIER DOCKER-COMPOSE
  
 ![Creation_container](https://github.com/Medy2468/keycloack-springboot/assets/95325770/dd10f564-1cb3-4f32-ad42-60f417c66f64)


* PAGE D'ACCUEIL KEYCLOAK
  
 ![Accueil_Keycloak](https://github.com/Medy2468/keycloack-springboot/assets/95325770/1a510947-bd9b-480a-a5ff-94a5f3b675ca)


* AUTHENTIFICATION KEYCLOAK
  
 ![Authentification](https://github.com/Medy2468/keycloack-springboot/assets/95325770/f6145855-deb3-4d3e-ba48-88f7a2858f44)


* ACCUEIL APRES AUTHENTIFICATION
  
 ![Accueil_Apres_Authentification](https://github.com/Medy2468/keycloack-springboot/assets/95325770/c41459c2-ddcd-4616-bce2-4f771e650229)


* CREATION D'UN REALM
  
 ![Add_Realm](https://github.com/Medy2468/keycloack-springboot/assets/95325770/cd881ca8-c1a8-48d6-96bb-331b3599002b)


* APRES CREATION DU REALM
  
 ![Realm_created](https://github.com/Medy2468/keycloack-springboot/assets/95325770/e6ac4930-5bb0-4fe1-9af7-953f63fbde08)


* CONFIGURATION CLIENT
  
 ![Config_Client1](https://github.com/Medy2468/keycloack-springboot/assets/95325770/79c8c9d9-fe67-4439-8208-114c76e3915f)

 ![Config_Client2](https://github.com/Medy2468/keycloack-springboot/assets/95325770/f36e77af-f76e-4126-b75c-52ed1c1d2250)


* CREDENTIAL
Ici c'est le code secret de notre client qu'on utilise pour générer le token sur postman

 ![Credentials](https://github.com/Medy2468/keycloack-springboot/assets/95325770/6d489d61-29cf-4b12-89ab-2b49cd3a52f8)


* AJOUTER UN UTILISATEUR
  
 ![Add_User](https://github.com/Medy2468/keycloack-springboot/assets/95325770/6a0f9d28-e9eb-4a4a-9d51-f829ea8a053c)


* APRES CONFIGURATION DU REALM, NOUS AVONS TOUS NOS ENDPOINTS
  
 ![Voir_Config](https://github.com/Medy2468/keycloack-springboot/assets/95325770/ea5cdaa5-9dcf-4b92-a39a-cd88f1f912c8)


* ON CLIQUE SUR ISSUER
  
 ![Account_Service](https://github.com/Medy2468/keycloack-springboot/assets/95325770/cd2b0a7a-be06-4010-839c-1011eaaaf3ae)


* NOUS AVONS L'INTERFACE DE ACCOUNT MANAGEMENT
 ![Account_Management](https://github.com/Medy2468/keycloack-springboot/assets/95325770/1fffc717-4f88-47f0-a634-184cc3ca3d81)


* ON CLIQUE SUR SIGNING IN POUR ACCEPTER A L'INTERFACE D'AUTHENTIFICATION
A ce niveau, nous devons utiliser les identifiants de notre user qu'on avait créé

 ![Sign_appli](https://github.com/Medy2468/keycloack-springboot/assets/95325770/630a7ed0-9862-494d-8ff2-0251f809e720)


* NOUVEL INTERFACE D'ACCUEIL
  
![Accueil](https://github.com/Medy2468/keycloack-springboot/assets/95325770/6e239491-9641-45ce-be5c-2d4692624a5c)


* NOUS FAISONS LA CONFIGURATION SUR POSTMAN
  
 ![Config_postman](https://github.com/Medy2468/keycloack-springboot/assets/95325770/10a35d7c-fba3-4cbf-9182-47d5278a214f)

 ![Config_Postman2](https://github.com/Medy2468/keycloack-springboot/assets/95325770/6acea3d4-9d7c-402d-a98a-f52a2f4d9718)


* ON GENERE LE TOKEN
  
 ![Token_Generate](https://github.com/Medy2468/keycloack-springboot/assets/95325770/7e85472b-6522-4d30-8842-595bbbd9a4a4)


* MANAGE ACCESS TOKEN
  
 ![Manage_Token](https://github.com/Medy2468/keycloack-springboot/assets/95325770/51a0bbc8-5e3f-441e-8039-8074339fe8e0)


* ON PASSE A LA CREATION D'UN CLIENT
  
 ![Create_Client](https://github.com/Medy2468/keycloack-springboot/assets/95325770/a0d48716-63ee-4767-9578-fa902ba98c5b)


INTEGRATION DE KEYCLOAK DANS NOTRE PROJET SPRING BOOT

* DEPENDANCES DANS LE POM.XML
  
  ![Dependances](https://github.com/Medy2468/keycloack-springboot/assets/95325770/037b548b-fbdb-4e85-828d-a3497c9a833f)


* CREATION DE L'ENTITE
  
  ![Entity](https://github.com/Medy2468/keycloack-springboot/assets/95325770/5640a8e2-4c5a-4dd3-a74f-a48ca8baa83d)


* CREATION DU SERVICE
  
  ![UserService](https://github.com/Medy2468/keycloack-springboot/assets/95325770/fbc2cac7-917f-4f92-8c22-de3db94939e3)


* CREATION DU CONTROLLER
  
  ![UserController](https://github.com/Medy2468/keycloack-springboot/assets/95325770/5871ac08-8aac-4c3c-9e74-d21905d9fe99)


* CONFIGURATION DU FICHIER SecurityConfig
  
  ![SecurityConfig](https://github.com/Medy2468/keycloack-springboot/assets/95325770/6ea5518f-7786-4c0a-810a-297031a25229)


* CONFIGURATION DU FICHIER KeycloakLogoutHandler
  ![Keycloack_logout](https://github.com/Medy2468/keycloack-springboot/assets/95325770/e6fb9903-430a-4b88-884a-5206879f9077)

* CONFIGURATION DU FICHIER application.properties
  ![Application_Properties](https://github.com/Medy2468/keycloack-springboot/assets/95325770/f89427ba-d53f-4ac5-90b3-dc09c58c1943)

* CONFIGURATION DU FICHER application.yml
  
  ![Application](https://github.com/Medy2468/keycloack-springboot/assets/95325770/cfbf8f06-dba7-40dc-94f6-afb1357611f2)


* RESULTAT DE LA BASE DE DONNEE
  
  ![Database](https://github.com/Medy2468/keycloack-springboot/assets/95325770/95610673-0453-4908-bb23-fe770ccd8a52)


* CONFIGURATION TOKEN POUR FAIRE LES TESTS
  
  ![ConfigTestToken1](https://github.com/Medy2468/keycloack-springboot/assets/95325770/ceeef240-1112-4c46-9c9f-6ff858ff70c4)

  ![ConfigTestToken2](https://github.com/Medy2468/keycloack-springboot/assets/95325770/0fc63f3a-8c0d-4f84-91af-a06adb7f5ba7)


* TOKEN GENERE
  
  ![Token_endpoint](https://github.com/Medy2468/keycloack-springboot/assets/95325770/1981bf91-1634-42f5-ab39-3c631568d250)


* TEST REUSSI !!
  
  ![Test_endpoint_success](https://github.com/Medy2468/keycloack-springboot/assets/95325770/977522c8-7565-4778-94e3-9d76a49850b0)

