/*JavaBasics.java

  ## DATA TYPES  __
    1] PRIMITIVE - the ones that already exist in java , we need not create
        ex - byte , short , char , int , boolean , long , float , double

    2] NON PRIMITIVE - the ones that we need to create
        ex - String , Array , Class , Object , Interface

___ in java before creating a variable we have to define its type
___ in java , each data type has its specific according to which it is given space in the
      memory .  space given in memory is measured in terms of bytes . in one byte there are
      8 bits . bit means single information . either 0 or 1 can come in the block which
      makes 1 bit . combination of 8 bits is a byte .
      - SIZES
      byte  -  1 byte   [ from -128 to 127  ]  i.e 256 no.s
      short  -  2 bytes
      char  -  2 bytes  [ from 'a' to 'z' , 'A' to 'Z' , special char @ $ % ^ # : ]
      boolean  -  1 byte  [ only  true  , false  ]
      int  -  4 bytes   [ from -billion to + 2 billion without decimal  ]
      long  -  8 bytes
      float  -  4 bytes  [ no. s with decimal ]
      double  - 8 bytes*/

      // class JAvaBasics {
      //   static public void main(String... a)  //tuple type that 
      //   {
      //     System.out.println("Hello");
      //   }
      // }
      public class JAvaBasics {
        static public void main(String[] args)
        {
          System.out.println("Hello");
        }
      }