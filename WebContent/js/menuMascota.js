function select(option) {

    var ids = ['a1', 'a2', 'a3', 'a4', 'a5', ' a6', 'a7', 'a8'];

    hiddenInput = document.getElementById("hiddenValue");
    hiddenInput.value = option;

    string = "a" + option;
    x = document.getElementById(string).className = "animalIcon selectedAnimal";

    for (i = 0; i < ids.length; i++) {
        if (ids[i] != string) {
            document.getElementById(ids[i]).className = "animaIcon";
        }

    }

}