#Lab2_JAVA
# Lab 19 — Fragments Dynamiques Android

## Objectif
Apprendre à créer et naviguer entre des fragments dynamiques avec `FragmentManager` dans une application Android.

---

## Structure du projet
FragmentsLab/
├── MainActivity.java        → Contrôleur principal, gère la navigation
├── FragmentOne.java         → Fragment 1 avec bouton interactif
├── FragmentTwo.java         → Fragment 2 avec SeekBar
├── activity_main.xml        → Layout principal avec FrameLayout conteneur
├── fragment_one.xml         → Layout du Fragment 1
└── fragment_two.xml         → Layout du Fragment 2

---

## Fonctionnalités

- Navigation entre deux fragments via les boutons **Vue 1** et **Vue 2**
- **Fragment 1** : affiche un message au clic sur le bouton "Appuyer ici"
- **Fragment 2** : SeekBar qui met à jour le niveau en temps réel
- Sauvegarde de l'état de la SeekBar lors de la rotation de l'écran
- Retour au fragment précédent avec le bouton Back

---

## Captures d'écran

### Vue 1 — État initial

<img width="1080" height="2340" alt="Screenshot_20260513_201923_FragmentsLab" src="https://github.com/user-attachments/assets/8654e510-bc18-4678-8f6d-f2466462b664" />

### Vue 1 — Après clic

<img width="1080" height="2340" alt="Screenshot_20260513_201930_FragmentsLab" src="https://github.com/user-attachments/assets/b1e94be8-6bac-4c32-ae75-5ab1ef51c7a1" />

### Vue 2 — SeekBar

<img width="1080" height="2340" alt="Screenshot_20260513_201944_FragmentsLab" src="https://github.com/user-attachments/assets/42b5afd0-8f24-43cd-bf28-107df59ca5bb" />

---

## Notions abordées

| Concept | Rôle |
|---|---|
| `Fragment` | Partie réutilisable de l'interface |
| `FragmentManager` | Gère l'ajout et le remplacement de fragments |
| `FragmentTransaction` | Représente une action sur les fragments |
| `addToBackStack()` | Permet le retour arrière avec Back |
| `onSaveInstanceState()` | Sauvegarde l'état avant rotation |
| `onViewCreated()` | Initialisation des composants de la vue |

---

## Technologies
- Java
- Android SDK (Min API 24)
- AndroidX Fragment<img width="1080" height="2340" alt="Screenshot_20260513_201923_FragmentsLab" src="https://github.com/user-attachments/assets/bf320ed8-a498-44c2-9b17-a6d540731e67" />
