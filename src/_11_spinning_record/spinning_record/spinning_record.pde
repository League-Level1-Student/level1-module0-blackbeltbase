PImage pictureOfRecord;                      
     import ddf.minim.*;            
  Minim minim;        //as a member variable
  AudioPlayer song;      //as a member variable
 int angleRecord = 0;
void setup(){
  size(600,600);                                 
        pictureOfRecord= loadImage("record.png"); 
         pictureOfRecord.resize(height,width);
         minim = new Minim(this);    //in the setup method
         song = minim.loadFile("awesomeTrack.mp3", 512);   
}

void draw(){
 
    image(pictureOfRecord,0, 0); 
    if(mousePressed){
     rotateImage(pictureOfRecord, angleRecord); 
     angleRecord++;
     song.play();
    }
    else{
    song.pause();}
}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
        println(angleRecord);
    }
