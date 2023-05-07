let score = prompt("score");

switch (parseInt(score/10)) {
    case 10 :
        document.write("A");
        break;
    case 9 :
        document.write("A");
        break;
    case 8 :
        document.write("B");
        break;
    case 7 :
        document.write("C");
        break;
    case 6 :
        document.write("D");
        break;
    default :
        document.write("F");
        break;
}