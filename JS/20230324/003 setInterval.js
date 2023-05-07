const hi = document.querySelector("#hi");
const btn = document.querySelector("#btn")
const btn2 = document.querySelector("#btn2")
function start() {
    let changeColor = setInterval(function () {
            let red = Math.floor(Math.random()*256);
            let green = Math.floor(Math.random()*256);
            let blue= Math.floor(Math.random()*256);
            hi.style.backgroundColor = "#"+red.toString(16)+green.toString(16)+blue.toString(16)
        }, 500)
}
// function stopInterval() {
//     let stopColor = 
// } 











