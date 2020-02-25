int numberWorms = 300;
void setup(){
  size(600, 600);
  background(0,0,0);
}
void draw(){
if(mousePressed){
 numberWorms++; 
} //<>// //<>//
  makeMagical();
  fill(#00FF28);
  for(int i = 0; i<=numberWorms;i++){
 
   ellipse(getWormX(i),getWormY(i),5,5);
  }
}
float frequency =5;
    float noiseInterval = PI;

    void makeMagical() {
        fill(2,3,2,10);
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
