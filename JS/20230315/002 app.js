const div = document.querySelector("#noContextMenu");
const callback = function (e) {
        e.preventDefault();
// contextmenu의 디폴트행동을 막는다.
};
div.addEventListener("contextmenu", callback);