PImage pictureOfRecord;
import ddf.minim.*;
Minim minim;
AudioPlayer song;

int angle = 0;

boolean mouse = false;

void setup(){
  size(600,600);
  pictureOfRecord= loadImage("record.png");
  pictureOfRecord.resize(height,width);
  minim = new Minim(this);
  song = minim.loadFile("sound.mp3", 512);
}

void draw(){
  image(pictureOfRecord, 0, 0);
    angle = angle + 3;
if (mousePressed){
  mouse = true;
}

if (mouse){
  rotateImage(pictureOfRecord, angle);
  image(pictureOfRecord, 0, 0);
  song.play();
  song.pause();
}

}

void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
