import java.util.*;

class Wrestler
{
  private String wname;
  private int weight;
  private int height;

  Wrestler(String wname, int weight, int height)
   {
     this.wname=wname;
     this.weight=weight;
     this.height=height;
   }

  public String getWname()
   {
     return wname;
   }

  public int getWeight()
   {
     return weight;
   }

  public int getHeight()
   {
     return height;
   }

  public String toString()
   {
     return wname + " " + weight + " " + height;
   }  
}

class WeightComparator implements Comparator<Wrestler>
{
  public int compare(Wrestler w1, Wrestler w2)
   {
      return w1.getWeight() - w2.getWeight();
   }
}

class HeightComparator implements Comparator<Wrestler>
{
  public int compare(Wrestler w1, Wrestler w2)
   {
      return w1.getHeight() - w2.getHeight();
   }
}

class NameComparator implements Comparator<Wrestler>
{
  public int compare(Wrestler w1, Wrestler w2)
   {
      return w1.getWname().compareTo(w2.getWname());
   }
}

class Demo
{
  public static void main(String args[ ])
   {
     ArrayList<Wrestler> list=new ArrayList<Wrestler>();

    list.add(new Wrestler("Satish", 120, 60));
    list.add(new Wrestler("Saket", 125, 62));
    list.add(new Wrestler("Anil", 100, 55));
    list.add(new Wrestler("Vikas", 90, 50));

    System.out.println(list);
    Collections.sort(list, new WeightComparator());
    System.out.println(list);
    Collections.sort(list, new HeightComparator());
    System.out.println(list);
    Collections.sort(list, new NameComparator());
    System.out.println(list);
   }
}