int y = 0;
int bucketY = 370;
int score = 0;
void setup() {
  size(400, 400);
  background(100);
}
int randomNumber = 20;
void draw() {
  checkCatch(y);
  if (y>400) {
    y = 0; 
    randomNumber = (int)random(width);
  }
  background(100);
  fill(0, 23, 255);
  stroke(50);
  ellipse(randomNumber, y, 20, 20);
  fill(255, 255, 255);
  rect(mouseX, bucketY, 30, 30);
  y+=2;
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
}
void checkCatch(int y) {
  if (y==height) {
    if ( randomNumber>mouseX && randomNumber<mouseX+30) {
      score++;
    } else if (score > 0 ) {
      score--;
    }

    println("Your score is now: " + score);
  }
}
