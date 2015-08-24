import java.io.*;
import java.util.InputMismatchException;

/**
 * Created by Shreyans on 2/21/2015 at 11:48 PM using IntelliJ IDEA (Fast IO Template)
 */

class CDMU01
{
    public static void main(String[] args) throws Exception
    {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        int [][] a=new int[10][2];
        for(int j=0;j<10;j++)
        {
            a[j][0]=in.readInt();
            a[j][1]=j+1;
        }
        for(int j=0;j<10;j++)
        {
            for(int k=j+1;k<10;k++)
            {
                if(a[k][0]>a[j][0])
                {
                    int temp=a[j][0];
                    a[j][0]=a[k][0];
                    a[k][0]=temp;
                    temp=a[j][1];
                    a[j][1]=a[k][1];
                    a[k][1]=temp;
                }
            }
        }
        for(int j=0;j<5;j++)
        {
            String s="";
            if(a[j][1]==1)
            {
                s="Dhaval";
            }
            else if(a[j][1]==2)
            {
                s="Shivang";
            }
            else if(a[j][1]==3)
            {
                s="Bhardwaj";
            }
            else if(a[j][1]==4)
            {
                s="Rishab";
            }
            else if(a[j][1]==5)
            {
                s="Maji";
            }
            else if(a[j][1]==6)
            {
                s="Gaurav";
            }
            else if(a[j][1]==7)
            {
                s="Dhruv";
            }
            else if(a[j][1]==8)
            {
                s="Nikhil";
            }
            else if(a[j][1]==9)
            {
                s="Rohan";
            }
            else if(a[j][1]==10)
            {
                s="Ketan";
            }
            out.printLine(s);
            int cnt=9-j;
            if(a[cnt][1]==1)
            {
                s="Dhaval";
            }
            else if(a[cnt][1]==2)
            {
                s="Shivang";
            }
            else if(a[cnt][1]==3)
            {
                s="Bhardwaj";
            }
            else if(a[cnt][1]==4)
            {
                s="Rishab";
            }
            else if(a[cnt][1]==5)
            {
                s="Maji";
            }
            else if(a[cnt][1]==6)
            {
                s="Gaurav";
            }
            else if(a[cnt][1]==7)
            {
                s="Dhruv";
            }
            else if(a[cnt][1]==8)
            {
                s="Nikhil";
            }
            else if(a[cnt][1]==9)
            {
                s="Rohan";
            }
            else if(a[cnt][1]==10)
            {
                s="Ketan";
            }
            out.printLine(s);
        }

        {
            out.close();
        }
    }

    //FAST IO
    private static class InputReader
    {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream)
        {
            this.stream = stream;
        }

        public int read()
        {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars)
            {
                curChar = 0;
                try
                {
                    numChars = stream.read(buf);
                } catch (IOException e)
                {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int readInt()
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do
            {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public String readString()
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do
            {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public double readDouble()
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.')
            {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, readInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.')
            {
                c = read();
                double m = 1;
                while (!isSpaceChar(c))
                {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, readInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public long readLong()
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do
            {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c)
        {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next()
        {
            return readString();
        }

        public interface SpaceCharFilter
        {
            public boolean isSpaceChar(int ch);
        }
    }

    private static class OutputWriter
    {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream)
        {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer)
        {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects)
        {
            for (int i = 0; i < objects.length; i++)
            {
                if (i != 0)
                    writer.print(' ');
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects)
        {
            print(objects);
            writer.println();
        }

        public void close()
        {
            writer.close();
        }

        public void flush()
        {
            writer.flush();
        }
    }
}