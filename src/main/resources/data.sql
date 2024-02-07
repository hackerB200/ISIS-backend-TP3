-- Initialisation des tables
INSERT INTO Employe(matricule, nom, email, superieur_matricule) VALUES
    (1, 'Rémi Bastide', 'Remi.Bastide@univ-jfc.fr', NULL),
    (2, 'Elyes Lamine', 'Elyes.Lamine@univ-jfc.fr', NULL),
    (3, 'Jean-Marie Pécatte', 'jean-marie.pecatte@univ-jfc.fr', NULL),
    (4, 'Marie Dupont', 'marie.dupont@orange.fr', NULL),
    (5, 'Pierre Paul', 'pierre.paul@gmail.com', 1),
    (6, 'Paul Durand', 'paul.durand@outlook.fr', 1);

INSERT INTO Administratif(matricule, diplome) VALUES
    (4, 'Master');

INSERT INTO Commercial(matricule, pourcentage) VALUES
    (5, 10);

INSERT INTO Technique(matricule, montant_prime) VALUES
    (6, 1000);

INSERT INTO Projet(nom, date_debut, date_fin) VALUES
    ('Projet 1', '2024-01-01', '2024-01-30'),
    ('Projet 2', '2024-02-01', '2024-02-15'),
    ('Projet 3', '2020-01-01', NULL);

INSERT INTO Participation(employe_matricule, projet_code, role, pourcentage) VALUES
    (1, 1, 'Chef de projet', 10),
    (2, 1, 'Concepteur', 10),
    (5, 1, 'Commercial', 10),
    (6, 1, 'Développeur', 70),
    (3, 2, 'Chef de projet', 10),
    (3, 2, 'Analyste', 80),
    (4, 2, 'Administratif', 10),
    (3, 3, 'Chef de projet', 10),
    (3, 3, 'Concepteur', 30),
    (3, 3, 'Développeur', 60);




