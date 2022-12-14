# hooks
Ce projet contient 7 classes java et représente le fonctionnement générale d'une école. Deux classes de tests permettent la vérification du bon fonctionnement de trois méthodes.

Le dossier githook que nous avons ajouté contient trois fichiers: commit-msg, pre-push et Hook.java. 
- Le fichier commit-msg permet au moment d'un commit d'executer le fichier Hook.java en lui donnant deux paramètres: un message et un booléen. Si le booléen vaut "false"
  alors le commit ne passe pas et il retourne le message qu'il a reçu en paramètre. Sinon le commit passe.

- Le fichier pre-push permet au moment d'un push d'executer le fichier Hook.java en lui donnant deux paramètres: un message et un booléen. Si le booléen vaut "false"
  alors le commit ne passe pas et il retourne le message qu'il a reçu en paramètre. Sinon le commit passe.
