const container = document.querySelector("#container");
const select = document.querySelector("select");
const h1 = document.querySelector("h1");
const h2 = document.querySelector("h2");
const btnGo = document.querySelector("#btnGo");
const btnRematch = document.querySelector("#btnRematch");
const nums = [];
let failStack = 0;
for (let i = 0; i<12; i++) {
    nums[i] = i+1;
};

//커서이벤트 막기
const preventCursor = function (item) {
    item.style.pointerEvents = "none";
};

// 배열에 안의 요소 섞기
for (let i = 0; i<nums.length; i++) {
    const random = Math.floor(Math.random()*11 +1)
    let temp;
    temp = nums[i];
    nums.splice(i, 1, nums[random]);
    nums[random] = temp;
};

// 숫자를 가진 박스 만들기
for (let i = 0; i<nums.length; i++) {
    const container = document.querySelector("#container");
    const divCreate = document.createElement("div");
    divCreate.classList.add("numbox");
    divCreate.innerHTML = nums[i];
    container.appendChild(divCreate);
};
const divs = document.querySelectorAll(".numbox");

// 유저가 고른 숫자 확정하는 go버튼
const go = function () {
    container.style.display = "flex";
    h1.innerHTML = `"${select.value}" is selected`;
    btnGo.style.display = "none";
    select.style.display = "none";
    h2.innerHTML = `${failStack}/3`;
};
btnGo.addEventListener("click", go);

//숫자박스 클릭했을때 이벤트
const click = function (e) {
    
    for (let i=0; i<nums.length; i++) {
        const clickNum = function () {
            if (nums[i] === parseInt(select.value)) {
                h1.innerHTML = "GOOD!";
                h1.style.display = "inline-block";
                h2.style.display = "none";
                for (let j=0; j<nums.length; j++) {
                    divs[j].style.color = "white";
                }
                divs[i].style.backgroundColor = "deepskyblue";
                preventCursor(container);
            } else if (failStack<2) {
                failStack++;
                h2.style.display = "inline-block";
                h2.innerHTML = "Wrong" + `${failStack}/3`;
                divs[i].style.color = "white";
                divs[i].style.backgroundColor = "darkred";
                preventCursor(divs[i]);
            } else if (failStack===2) {
                failStack++;
                h2.innerHTML = "Wrong" + `${failStack}/3`;
                h1.innerHTML = "FAIL!";
                for (let j=0; j<nums.length; j++) {
                    divs[j].style.color = "white";
                }
                divs[i].style.backgroundColor = "darkred";
                preventCursor(container);
            }

            divs[i].style.border = "2px solid darkred";
            btnRematch.style.display = "inline";
        };
        divs[i].addEventListener("click",clickNum);
    }
};

// 같으면 good
// 다르면 wrong stack+1
// 스택3되면 fail
// 
// 
// 
// 
// 
// 
// 


// 리매치버튼
const rematch = function () {
    location.reload();
};
btnRematch.addEventListener("click", rematch);


click();