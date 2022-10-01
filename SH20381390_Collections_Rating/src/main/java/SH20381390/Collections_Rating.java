package SH20381390;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.text.html.HTMLDocument.Iterator;
public class Collections_Rating {
	    public static void main( String[] args ) throws Exception
	    {   
	    	System.out.println("Enter Student name or subject name");
	    	Scanner s=new Scanner(System.in);
	    	String name=s.nextLine();
	    	//adding values to the list Assignments
	    	ArrayList<Assignments> value=new ArrayList<>();
	    	
	    	value.add(new Assignments("Ananth","Electro Fields","Test",100));
	    	value.add(new Assignments("Bhagath","Electro Fields","Test",78));
	    	value.add(new Assignments("Chaya","Electro Fields","Test",68));
	    	value.add(new Assignments("Esharath","Electro Fields","Test",87));
	    	value.add(new Assignments("Bhagath","Electro Fields","quiz",100));
	    	value.add(new Assignments("Chaya","Electro Fields","lab",10));
	    	value.add(new Assignments("Ananth","Electro Fields","project",100));
	    	value.add(new Assignments("Esharath","Electro Fields","project",100));
	    	value.add(new Assignments("Bhagath","Electro Fields","quiz",50));
	    	value.add(new Assignments("Ananth","Electro Fields","quiz",100));
	    	value.add(new Assignments("Bhagath","Electro Fields","lab",10));
	    	value.add(new Assignments("Chaya","Electro Fields","project",100));
	    	value.add(new Assignments("Bhagath","Electro Fields","project",100));
	    	value.add(new Assignments("Ananth","Computing Techniques","Test",86));
	    	value.add(new Assignments("Ananth","Electro Fields","quiz",100));
	    	value.add(new Assignments("Bhagath","Computing Techniques","project",100));
	    	value.add(new Assignments("Ananth","Electro Fields","lab",100));
	    	value.add(new Assignments("Chaya","Computing Techniques","quiz",20));
	    	value.add(new Assignments("Ananth","Electro Fields","Test",100));
	    	value.add(new Assignments("Chaya","Electro Fields","Test",92));
	    
	    	//adding values to the list Distribution
	    	
	    	List<Distributions> subject=new ArrayList<>();
	    	subject.add(new Distributions("Test",40));
	    	subject.add(new Distributions("quiz",20));
	    	subject.add(new Distributions("lab",10));
	    	subject.add(new Distributions("project",30));
	    	//reference values
	    	String sub1="Electro Fields";
	    	String sub2="Computing Techniques";
	    	int count=0,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0;
	    	int TestEF=0,quizEF=0,labEF=0,projectEF=0;
	    	int TestCT=0,quizCT=0,labCT=0,projectCT=0;
	    	int CTtest=subject.get(0).getWeight();
		    int CTquiz=subject.get(1).getWeight();
		    int CTlab=subject.get(2).getWeight();
		    int CTproject=subject.get(3).getWeight();
		    int TestEFoverall=0,quizEFoverall=0,labEFoverall=0,projectEFoverall=0,TestCToverall=0,quizCToverall=0,projectCToverall=0;
			int labCToverall=0;
	    	boolean r=false;
	    	//loop to check whether the input is equals to subject or not
	    	for(int i=0;i<value.size();i++){
	    		if(value.get(i).student_Name.equals(name)){
	    			r=true;
	    			break;
	    		}
	    		
	    	}
	        //operations to be executed{
	    	
	    	for(int i=0;i<value.size();i++){
	    		if(value.get(i).student_Name.equals(name)&&value.get(i).subject.equals(sub1)) {
	    			
	    				if(subject.get(0).getAssignment_Category().equals(value.get(i).assignment_Category)) {
	    	    				TestEF+=value.get(i).points;
	    	    				count++;
	    			                }
	    				if(subject.get(1).getAssignment_Category().equals(value.get(i).assignment_Category)) {
		    				quizEF+=value.get(i).points;
		    				count1++;
				                    }
	    				if(subject.get(2).getAssignment_Category().equals(value.get(i).assignment_Category)) {
		    				labEF+=value.get(i).points;
		    				count2++;
	    							}
	    				if(subject.get(3).getAssignment_Category().equals(value.get(i).assignment_Category)) {
		    				projectEF+=value.get(i).points;
		    				count3++;
	    							}
	    			}		
	    				
	    				
	    				if(value.get(i).student_Name.equals(name)&&value.get(i).subject.equals(sub2)) {
	    	    			
	        				if(subject.get(0).getAssignment_Category().equals(value.get(i).assignment_Category)) {
	        	    				TestCT+=value.get(i).points;
	        	    				count4++;
	        						}
	        				if(subject.get(1).getAssignment_Category().equals(value.get(i).assignment_Category)) {
	    	    				quizCT+=value.get(i).points;
	    	    				count5++;
	        						}
	        				if(subject.get(2).getAssignment_Category().equals(value.get(i).assignment_Category)) {
	    	    				labCT+=value.get(i).points;
	    	    				count6++;
	        						}
	        				if(subject.get(3).getAssignment_Category().equals(value.get(i).assignment_Category)) {
	    	    				projectCT+=value.get(i).points;
	    	    				count7++;
	        						}
	    				}
	    		}
	 
	    	    if(count!=0) {
	    	        TestEFoverall=((CTtest/count)*(TestEF))/100;
	    	    }
	    	    else {
	    	    	TestEFoverall=CTtest*TestEF/100;
	    	    }
	    	    if(count1!=0)
	            { quizEFoverall=((CTquiz/count1)*(quizEF))/100;
	            }
	    	    else {
	    	    	quizEFoverall=CTquiz*quizEF/100;
	    	    }

	    	    if(count2!=0) {
	    	    	labEFoverall=((CTlab/count2)*(labEF))/100;
	    	    	}
	    	    else {
	    	    	labEFoverall=CTlab*labEF/100;
	    	    }
	    	    if(count3!=0) { 
	    	    	projectEFoverall=((CTproject/count3)*(projectEF))/100;
	    	    	}
	    	    else {
	    	    	projectEFoverall=CTproject*projectEF/100;
	    	    }
	    	    if(count4!=0) {
	    	    	TestCToverall=((CTtest/count4)*(TestCT))/100;
	    	    }
	    	    else {
	    	    	TestCToverall=CTtest*TestCT/100;
	    	    }
	    	    if(count5!=0) {
	    	    	quizCToverall=((CTquiz/count5)*(quizCT))/100;
	    	    }
	    	    else {
	    	    	quizCToverall=CTquiz*quizCT/100;
	    	    }
	    	    if(count6!=0) {
	    	    	labCToverall=((CTlab/count6)*(labCT))/100;
	    	    }
	    	    else {
	    	    	labCToverall=CTlab*labCT/100;
	    	    }
	    	    if(count7!=0) {
	    	    	projectCToverall=((CTproject/count7)*(projectCT))/100;
	    	    }
	    	    else {
	    	    	projectCToverall=CTproject*projectCT/100;
	    	    }
	    	
	    	   int overallEF= TestEFoverall+quizEFoverall+labEFoverall+projectEFoverall;
	    	   int overallCT= TestCToverall+quizCToverall+labCToverall+projectCToverall;
	    	

	   //output format
	       	if(r) {
	       		     System.out.println("\n");
	    	    	 System.out.println("studentName:"+name);
	    	    	 System.out.println("\n");
	    	    	 System.out.println("subject \t\tTestScore\tquizScore\tlabScore\tprojectScore\toverallScore\n");
	    	    	    
	    	    	    System.out.println("Electro Fields"+"  \t "+TestEFoverall+"\t\t"+quizEFoverall+"\t\t"+labEFoverall+"\t\t"+projectEFoverall+"\t\t"+overallEF+"\t\t"+"\n"+
	    	    	    "Computing Techniques"+" \t "+TestCToverall+"\t\t"+quizCToverall+"\t\t"+labCToverall+"\t\t"+projectCToverall+"\t\t"+overallCT);
	    	    	    }
	       	else if(name.equals(sub1)) {
	       		for(int i=0;i<4;i++) {
	       			name=value.get(i).student_Name;
	       		for(int i1=0;i1<value.size();i1++) {
	       			if(value.get(i1).student_Name.equals(name)&&value.get(i1).subject.equals(sub1)) {
					if(subject.get(0).getAssignment_Category().equals(value.get(i1).assignment_Category)) {
		    				TestEF+=value.get(i1).points;
		    				count++;
				                }
					if(subject.get(1).getAssignment_Category().equals(value.get(i1).assignment_Category)) {
	    				quizEF+=value.get(i1).points;
	    				count1++;
			                    }
					if(subject.get(2).getAssignment_Category().equals(value.get(i1).assignment_Category)) {
	    				labEF+=value.get(i1).points;
	    				count2++;
								}
					if(subject.get(3).getAssignment_Category().equals(value.get(i1).assignment_Category)) {
	    				projectEF+=value.get(i1).points;
	    				count3++;
								}
					 if(count!=0) {
			    	        TestEFoverall=((CTtest/count)*(TestEF))/100;
			    	    }
			    	    else {
			    	    	TestEFoverall=CTtest*TestEF/100;
			    	    }
			    	    if(count1!=0)
			            { quizEFoverall=((CTquiz/count1)*(quizEF))/100;
			            }
			    	    else {
			    	    	quizEFoverall=CTquiz*quizEF/100;
			    	    }

			    	    if(count2!=0) {
			    	    	labEFoverall=((CTlab/count2)*(labEF))/100;
			    	    	}
			    	    else {
			    	    	labEFoverall=CTlab*labEF/100;
			    	    }
			    	    if(count3!=0) { 
			    	    	projectEFoverall=((CTproject/count3)*(projectEF))/100;
			    	    	}
			    	    else {
			    	    	projectEFoverall=CTproject*projectEF/100;
			    	    }
			    	    overallEF=TestEFoverall+quizEFoverall+labEFoverall+projectEFoverall;
	       			}
	       			
	       		}
	       	
	       		System.out.println("SubjectName:"+name);
	       		System.out.println(name+"\t\t"+TestEFoverall+"\t\t"+quizEFoverall+"\t\t"+labEFoverall+"\t\t"+projectEFoverall+"\t\t"+overallEF+"\t\t"+"\n");
	   			TestEF=0;quizEF=0;labEF=0;projectEF=0;count=0;count1=0;count2=0;count3=0;
	       		}
	       		
	       		
	       	}
	    	else if(name.equals(sub2)) {
	       		for(int i=0;i<4;i++) {
	       			name=value.get(i).student_Name;
	       		for(int i1=0;i1<value.size();i1++) {
	  
	       				
	    				if(value.get(i1).student_Name.equals(name)&&value.get(i1).subject.equals(sub2)) {
	    	    			
	        				if(subject.get(0).getAssignment_Category().equals(value.get(i1).assignment_Category)) {
	        	    				TestCT+=value.get(i).points;
	        	    				count4++;
	        						}
	        				if(subject.get(1).getAssignment_Category().equals(value.get(i1).assignment_Category)) {
	    	    				quizCT+=value.get(i).points;
	    	    				count5++;
	        						}
	        				if(subject.get(2).getAssignment_Category().equals(value.get(i1).assignment_Category)) {
	    	    				labCT+=value.get(i).points;
	    	    				count6++;
	        						}
	        				if(subject.get(3).getAssignment_Category().equals(value.get(i1).assignment_Category)) {
	    	    				projectCT+=value.get(i).points;
	    	    				count7++;
	        						}
	        				 if(count4!=0) {
	        		    	    	TestCToverall=((CTtest/count4)*(TestCT))/100;
	        		    	    }
	        		    	    else {
	        		    	    	TestCToverall=CTtest*TestCT/100;
	        		    	    }
	        		    	    if(count5!=0) {
	        		    	    	quizCToverall=((CTquiz/count5)*(quizCT))/100;
	        		    	    }
	        		    	    else {
	        		    	    	quizCToverall=CTquiz*quizCT/100;
	        		    	    }
	        		    	    if(count6!=0) {
	        		    	    	labCToverall=((CTlab/count6)*(labCT))/100;
	        		    	    }
	        		    	    else {
	        		    	    	labCToverall=CTlab*labCT/100;
	        		    	    }
	        		    	    if(count7!=0) {
	        		    	    	projectCToverall=((CTproject/count7)*(projectCT))/100;
	        		    	    }
	        		    	    else {
	        		    	    	projectCToverall=CTproject*projectCT/100;
	        		    	    }
	        		    	 overallCT=TestCToverall+quizCToverall+labCToverall+projectCToverall;
					
	       			}
	       			
	       		}
	       		
	       		System.out.println("\n");
	       	
	       		System.out.println(name+"\t\t"+TestCToverall+"\t\t"+quizCToverall+"\t\t"+labCToverall+"\t\t"+projectCToverall+"\t\t"+overallCT);
	   			TestCT=0;quizCT=0;labCT=0;projectCT=0;count4=0;count5=0;count6=0;count7=0;
	       		
	       		}
	       	}
	    	else {
	    		System.out.println("No student/subject found");
	    	}
	    }

		
	    
}
