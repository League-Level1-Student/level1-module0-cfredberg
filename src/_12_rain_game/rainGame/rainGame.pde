void setup(){
  size(600, 600);
}

int y = 0;
int x = (int) random(width);
int score;
boolean inOrNot = false;

void draw(){
  y = y + 3;
  if (y == 600){
    y = 0;
    x = (int) random(width);
    inOrNot = false;
  }
  background(0, 255, 0);
  fill(0, 0, 255);
  stroke(0, 0, 0);
  ellipse(x, y, 10, 10);
  fill(#989898);
  rect(mouseX, (600 - 34), 30, 34);
  checkCatch();
  fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}

void checkCatch(){
  if (inOrNot == false){
    if (y > 566){
         if (x > mouseX && x < mouseX+30){
            score++;
            println("Your score is now: " + score);
            inOrNot = true;
         }
         else if (score > 0) {
            score--;
            println("Your score is now: " + score);
            inOrNot = true;
         }
  }
  }
    }
