# saeJava_BLEVIN_MALOSSE_SPITZ

- Persistance des données : 

    Si aucune sauvegarde n'est effectuée avant d'essayer de charger le registre, le programme crash car il ne vérifie pas que le fichier existe. Il aurait fallu qu'au premier chargement des données, le programme vérifie si le fichier existe et si non, le crée, mais nous n'avons pas eu le temps d'implémenter celà.

    Le compteur static de bureau et personne n'est pas enregistré quand arrête le programme, donc au redémarrage le compteur repare à 0 (ou 1 pour les bureaux) et il est donc possible de se retrouver avec deux personnes (ou bureaux) ayant le même numéro supposé être unique. Celà peut entrainer des erreurs. Deux possibilités s'offraient à nous :

        - Enregistrer la valeur du compteur à l'arrêt du programme dans un fichier et au redémarrage, set la valeur du compteur à cette valeur enregistrée
        - Au démarrage du programme set la valeur du compteur static à la valeur de l'ID du dernier objet créé (donc la valeur la plus élevée)

 - classe Clavier :
    
    Changement du catch (pour int et double) dans la classe Clavier pour renvoyer au menu principal au lieu de fermer le programme en cas d'erreur

- classe Bureau : 

    La méthode changeNbPlace() permettant de changer le nombre de place du bureau courant n'a pas été implémentée faute de temps pour réaliser les tests nécessaires, nous avons donc préféré la laisser en private (elle n'est pas appelée à l'intérieur de la classe) plutôt que de potentiellement créer des problèmes en l'intégrant.

- classe Salaire : 

    Sur la branche Audran il y a un début de classe Salaire, créée pour décharger la classe Personnel qui gère trop de méthodes et d'attributs, mais nous n'avons pas réussi pas à la réaliser correctement et à en faire quelque chose d'utilisable proprement. L'objectif était d'avoir une interface ISalaire avec une classe par type de salaire pour simplifier la gestion des salaires. Malheureusement la notion d"Interface Segregation Protocol" ne nous a été présentée et expliquée en cours de qualité de développement que le jour du rendu. Ce qui nous a rendu tout de suite évident la manière de procéder pour réaliser ce que nous souhaitions, mais nous n'avons pût le faire faute de temps.


Encapsulation des données : 

    Il était prévu de passer toutes les méthodes des classes en protected. L'application a été conçu de sorte à isoler la classe applicative dans un package séparé pour ainsi respecter l'encapsulation des données.
    Seule la classe Console devait rester publique et la classe Application importer la classe Console. 

JavaDoc : 

    Nous n'avons pas eu le temps d'écrire toute la JavaDoc du projet. La JavaDoc générée n'a été push directement que sur la branche Lucas pour éviter que la suppression du dist du .gitignore ne crée quelconques problèmes/erreur aussi tard avant le rendu. Elle a aussi été ajouté au main en copiant/collant le dossier dans le projet depuis la branche Lucas.

NB : Yodwaae est le compte gitlab personnel de Lucas SPITZ DREVET
