class Kuleczka
{
  //właściwości
  int x, y; //połozenie kuleczki na ekranie
  int r; // promień  kuleczki
  int wr, wg, wb;//r,g,b  wnętrza kuleczki
  int predkosc;
  //konstruktor
  Kuleczka()
  {
    r=(int)random( 5, 20); 
    x=(int)random( 0, width );
    y=(int)random( 0, height );
    wr=(int)random(256);
    wg=(int)random(692);
    wb=(int)random(568);
    predkosc= (int)random(2, 25);
  }
  //metody
  void narysuj()
  {
    fill(wr,wg,wb);
    ellipse( x, y, r*2, r*2 );
  }
  void spadaj()
  {
    y=y+predkosc;
    if (y>=height) y=0;
    x=x+predkosc;
    if(x>=width) x=0;
  }
}//koniec klasy Kuleczka