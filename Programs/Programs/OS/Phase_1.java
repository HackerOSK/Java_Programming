package Programs.OS;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.Arrays;

public class Phase_1 {
    public static void main(String[] args) throws Exception {
        char Memory[][] = new char[100][4];
        int IC = 0;
        char IR[] = new char[4];
        char GP[] = new char[4];
        boolean toogle = false;
        int Jobinfo[] = new int[3];




//        GD, PD, H
//        LR, SR, CR, BT

//        Loading our Job inside the memory
        LoadFun(Memory,Jobinfo);

//        Execute the Job
        boolean isComplete=false;
        int blc=0;
        int ind=0;
        while(IC<Jobinfo[1])
        {
            for(int i=0;i<4;i++)
            {
                IR[i] = Memory[ind][i];
            }
            System.out.println(IR);
            Execute(IR,Memory);
            IC++;
            ind++;
            System.out.println((int)(Memory[ind][0]));
            if(Memory[ind][0]==0)
            {
                blc+=10;
                ind=blc;
            }
        }

    }

    private static void Execute(char[] ir,char[][] memory) throws Exception{
        StringBuilder str = new StringBuilder();
        str.append(ir[0]);
        str.append(ir[1]);
        int res = (ir[2]-'0')*10 + (ir[3]-'0');
        if(str.charAt(0)=='H')
        {
            System.out.println("Exit");
        }else{
            if(str.toString().compareTo("GD")==0)
            {
                System.out.println(res);
                getData(res,memory);
            }else if(str.toString().compareTo("PD")==0)
            {
                putData(res,memory);
            }else{
                System.out.println("Invalide Instruction!");
            }
        }


    }

    private static void putData(int res, char[][] memory)throws Exception {
        StringBuilder stb = new StringBuilder();
        for(int i=res;i<100;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(memory[i][j]=='$')
                {
                    break;
                }else {
                    if(memory[i][j]!=0)
                    {
                        stb.append(memory[i][j]);
                    }
                }
            }
        }

        File fp = new File("O:\\Java_Programming\\Programs\\Programs\\OS\\Output.txt");
        FileWriter fwr = new FileWriter(fp);
        BufferedWriter bufwr = new BufferedWriter(fwr);
        bufwr.write(stb.toString());
        bufwr.close();


    }

    private static void getData(int res,char[][] memory) throws Exception{
        File fp = new File("O:\\Java_Programming\\Programs\\Programs\\OS\\Input.txt");
        FileReader frd = new FileReader(fp);
        BufferedReader bufrd = new BufferedReader(frd);
        String line;
        boolean inputStart=false;
        while((line = bufrd.readLine()) != null)
        {
            int done =0;
            if(line.contains("$DTA"))
            {
                inputStart=true;
            }
            if(line.contains("$END"))
            {
                inputStart=false;
                break;
            }
            while(inputStart)
            {
                int ind=0;
                    for(int r=res;r<100;r++)
                    {
                        for(int c=0;c<4;c++)
                        {
                            memory[r][c] = line.charAt(ind);
                            ind++;
                            if(ind>=line.length())
                            {
                                done=1;
                                break;
                            }
                        }
                        if(done==1)
                        {
                            break;
                        }
                    }

                if(done==1)
                {
                    break;
                }

            }

        }
        System.out.println("Memory");
        for(int i=0;i<100;i++)
        {
            System.out.print(i+" =>  ");
            System.out.println(Arrays.toString(memory[i]));
        }


    }


    private static void LoadFun(char[][] memory, int[] jobinfo) throws Exception{
        File fp = new File("O:\\Java_Programming\\Programs\\Programs\\OS\\Input.txt");
        FileReader frd = new FileReader(fp);
        BufferedReader bufred = new BufferedReader(frd);

        String jobline = bufred.readLine();
        String arr[] = jobline.split(" ",4);
        System.out.println(Arrays.toString(arr));
        for(int i=1;i<4;i++)
        {
            jobinfo[i-1] = StringToNum(arr[i]);
        }

        System.out.println(Arrays.toString(jobinfo));
        int blc=0;
        int ind =  blc;
        boolean IsProgram = true;



        String line;
        int l = 2;
        while ((line = bufred.readLine()) != null) {
            // Process the line here
            System.out.println(line);
            int done=0;

            while (IsProgram)
            {
                if(line.contains("$DTA"))
                {
                    IsProgram=false;
                    break;
                }
                else{
                    int ptr=0;
                    for(int i=ind;i<(ind+10);i++)
                    {
                        for(int j=0;j<4;j++)
                        {
                            memory[i][j]=line.charAt(ptr);
                            if(ptr+1==line.length())
                            {
                                done=1;
                                break;
                            }
                            ptr++;
                        }
                        if(i==ind+9)
                        {
                            done=1;
                        }


                        if(done==1)
                        {
                            break;
                        }
                    }
                    if(done==1)
                    {
                        break;
                    }
                }
            }
            blc+=10;
            ind=blc;
            l++;
        }

        System.out.println("Memory");
        for(int i=0;i<100;i++)
        {
            System.out.print(i+" =>  ");
            System.out.println(Arrays.toString(memory[i]));
        }









    }

    private static int StringToNum(String s) {
        int res=0;
        int mul=1000;
        for(int i=0;i<4;i++)
        {
            int ans = s.charAt(i)-'0';
            ans*=mul;
            res+=ans;
            mul/=10;
        }
        return res;
    }
}
