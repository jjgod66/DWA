let gallery = document.querySelector("#balloon-gallery");
const balloons = document.querySelectorAll(".balloon");
let message = document.querySelector("#yay-no-balloons");

let counter = 0;

// For Loop
for (let i = 0; i < balloons.length; i++) {
  const pop = function (e) {
    if (!(balloons[i].classList.contains("once"))) {
      balloons[i].style.backgroundColor = "#ededed";
      balloons[i].innerHTML = "POP";
      // balloons[i].classList.add("once");
      counter++;
      console.log(counter);
      balloons[i].removeEventListener("mouseenter", pop);
    }
    if (counter === balloons.length) {
      console.log("wow");
      gallery.style.display = "none";
      message.style.display = "block";
    };
  }
  balloons[i].addEventListener("mouseenter", pop);
};


// 이벤트 등록
// callback 함수가 할일
// 풍선을 지운다 style.backgroundColor = "#ededed";
// div태그내에 텍스트 POP을 쓴다
// 터트린 풍선갯수를 센다
// 모든 풍선이 터졌으면 message 태그를 보여준다.