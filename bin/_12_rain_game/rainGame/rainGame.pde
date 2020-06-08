void setup(){
  size(600, 600);
}

int y = 0;
int x = (int) random(0, 600);

void draw(){
  y = y + 3;
  if (y == 600){
    y = 0;
  }
  background(0, 255, 0);
  fill(0, 0, 255);
  stroke(0, 0, 0);
  ellipse(x, y, 10, 10);
}
