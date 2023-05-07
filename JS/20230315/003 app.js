//"mouseenter", "mouseleave"

const h2 = document.querySelector("h2");
const mouseEnter = function (e) {
        h2.innerHTML = "Mouse Enter..."
        h2.style.backgroundColor = "red";
        h2.style.color = "white";
};
const mouseLeave = function (e) {
        h2.innerHTML = "Mouse Leave..."
        h2.style.backgroundColor = "white";
        h2.style.color = "black";
};
h2.addEventListener("mouseenter", mouseEnter);
h2.addEventListener("mouseleave", mouseLeave);