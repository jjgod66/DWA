const verify = (e) => {
    const div = document.querySelector("div");
    // guessd.inputvalue를 받아서 변수에 저장
    let textValue = document.querySelector("#guessed").value;
    intValue = parseInt(textValue, 10);
    // 난수 하나를 변수에 저장
    const goal = Math.floor(Math.random() * 10 + 1);
    // 둘을 비교 타입은 같게
    if (isNaN(intValue)) { //isNaN은 문자열인지 아닌지를 물어보는 함수. 답은 항상 참 또는 거짓으로 나온다.
        div.innerHTML = "<span class='red'>숫자</span>를 써주세요";
        return;
    }
    
    if (intValue < 1 || intValue > 10) {
        div.innerHTML = "<span class='red'>1에서 10 사이의 정수</span>를 써주세요";
    } else if (intValue === goal) {
        div.innerHTML = "<span class='red'>정답</span>입니다!";
    } else {
        div.innerHTML = `<span class='red'>오답</span>입니다 정답은 <span class='red'>${goal}</span>입니다`;
    }
};