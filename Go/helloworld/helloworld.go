// package main; import "fmt"; func main() { fmt.Println("👋 Hello World.") }
/*
this is comment
*/
package main

// Import OS and fmt packages
import (
	"fmt"
	"os"
)

const A int = 1
const B = 2 //inferred
const (
	C     = 3.14
	D int = 4
)

var aa string
var bb string = "outside function"

// Let us start
func main() {
	fmt.Println("Hello, world!")                          // Print simple text on screen
	fmt.Println(os.Getenv("USER"), ", Let's be friends!") // Read Linux $USER environment variable

	//Variables
	my_number := 100 //type is inferred
	var my_str1 string = "test1"
	var my_str2 = "test2" //type is inferred
	fmt.Println(my_number)
	fmt.Println(my_str1)
	fmt.Println(my_str2)

	var a string //default value is assigned
	var b int
	var c bool
	fmt.Println(a)
	fmt.Println(b)
	fmt.Println(c)
	fmt.Println(aa)
	fmt.Println(bb)

	var aaa, bbb int = 1, 2
	var aaaa, bbbb = 3, "test3"

	var (
		ab int
		bc int = 2
	)

	fmt.Println(aaa)
	fmt.Println(bbb)
	fmt.Println(aaaa)
	fmt.Println(bbbb)
	fmt.Println(ab)
	fmt.Println(bc)

	// Constants
	fmt.Println(A)
	fmt.Println(B)
	fmt.Println(C)
	fmt.Println(D)

	//Output
	fmt.Print(A, "\n", B)
	fmt.Print("\n")
	fmt.Printf("Value is %v\n", A)
	fmt.Printf("Type is %T\n", B)

	//Data type
	var a1 int = 1
	var a2 float32 = 3.14
	var a3 bool = true
	var a4 string = "data type"
	fmt.Println(a1)
	fmt.Println(a2)
	fmt.Println(a3)
	fmt.Println(a4)

	//Arrays
	var b1 = [3]int{1, 2, 3}
	var b2 = [...]int{4, 5, 6}
	b3 := [...]string{"a", "b", "c"}
	fmt.Println(b1)
	fmt.Println(b2)
	fmt.Println(b3)

	//Slices, length can grow or shrink
	empty_slice := []int{}
	mySlice := []int{1, 2, 3}
	fmt.Println(empty_slice)
	fmt.Println(mySlice)

	arr1 := [6]int{1, 2, 3, 4, 5, 6}
	slice1 := arr1[2:4] //create slice from an array
	fmt.Println(len(slice1))
	fmt.Println(cap(slice1))     //value is 4 as it can grow to then end of array 2->5
	slice2 := make([]int, 5, 10) //len, cap, make a slice
	fmt.Println(len(slice2))
	fmt.Println(cap(slice2))

	slice1[0] = 100 //change referred array as well
	fmt.Println(slice1)
	fmt.Println(arr1)

	slice1 = append(slice1, 101, 102) //change referred array as well
	fmt.Println(slice1)
	fmt.Println(arr1)
	slice3 := append(slice1, slice2...) //append two slices
	fmt.Println(slice3)

	neededNumbers := arr1[:len(arr1)-2]
	numbersCopy := make([]int, len(neededNumbers))
	copy(numbersCopy, neededNumbers) //use copy to make memory efficent
	fmt.Println(numbersCopy)

	//Operations
	var c1 int = 100 + 2
	fmt.Println(c1)

	// Conditions
	if 20 < 18 {
		fmt.Println("20 is bigger than 18")
	} else if 2 > 1 { //should be like } else if $condition {
		fmt.Println("ttt")
	}

	d1 := 20
	d2 := 23
	if d1 < d2 {
		fmt.Printf("%v is smaller than %v\n", d1, d2)
	} else { //The brackets in the else statement should be like } else {:
		fmt.Printf("%v is bigger than %v\n", d1, d2)
	}

	//Switch, all cases must be the same type
	day := 2
	switch day { //single cases
	case 1:
		fmt.Println("Monday")
	case 2:
		fmt.Println("Tuesday")

	default:
		fmt.Println("not right")
	}

	switch day { //multiple cases
	case 1, 2:
		fmt.Println("ok")
	default:
		fmt.Println("not right")
	}

	//Loop

	for i := 0; i < 5; i++ {
		fmt.Println(i)
	}
	for i := 0; i <= 30; i += 10 {
		fmt.Println(i)
		if i == 0 {
			continue
		} else if i == 20 {
			break
		}
	}

	fruits := []string{"apple", "orange", "banana"} //range, "for index, value := array|slice|map"
	for idx, val := range fruits {
		fmt.Println("%v\t%v\n", idx, val)
	}

	for _, val := range fruits { // to omit index or index, use _
		fmt.Println("%v\n", val)
	}

	// Function
	myMessage()
	myMessage()
	familyName("Frank", 43)
	fmt.Println(familyName("Evara", 45))
	fmt.Println(familyNameNamedReturn("Frank", 55))
	myName, myFutureAge := familyNameNamedReturn("Evara", 65)
	_, myFutureAge2 := familyNameNamedReturn("Evara", 65) //omit first return value

	fmt.Println(myName, myFutureAge)
	fmt.Println(myFutureAge2)
	fmt.Println(fibonacci(3))

	//Struct
	var pers1 Person
	var pers2 Person

	pers1.name = "Frank"
	pers1.age = 34

	pers2.name = "Evara"
	pers2.age = 34

	fmt.Println(pers1.name)
	printPerson(pers2)

	//Map
	var e map[string]string                                         // create empty map NOT "var e = map[string]sting", no "=" in it
	var e1 = map[string]string{"brand": "ford", "model": "mustang"} // two strings 1st: key type and 2nd: value type
	e2 := map[string]int{"Oslo": 1, "Bergen": 2, "Trondheim": 3, "Stavanger": 4}
	fmt.Println(e)
	fmt.Println(e1)
	fmt.Println(e2)

	var e3 = make(map[string]string) // use make to create an empty map then assign value
	e3["name"] = "frank"
	e4 := make(map[string]string)
	e4["name"] = "evera"

	fmt.Println(e3["name"]) //access map elements

	delete(e1, "brand") //delete map key
	fmt.Println(e1)

	val1, ok1 := e2["Oslo"] //check key existance
	val2, ok2 := e2["Beijing"]
	fmt.Println(val1, ok1) //output is 1 and true, it means value is 1 and key exists
	fmt.Println(val2, ok2) //output is 0 and false, it means key doesn't exist

	e5 := e2 //maps are reference to hash table, chagne one will affect others if they point to same hash table
	e5["Stavanger"] = 5
	fmt.Println(e2)

	for k, v := range e2 {
		fmt.Println(k, v)
	}

}

func myMessage() {
	fmt.Println("In the function")
}

func familyName(fname string, age int) int { //declare return type and return
	fmt.Println("Hello", fname, " Refsnes age", age)
	afterTenTearsAge := age + 10
	return afterTenTearsAge

}

func familyNameNamedReturn(fname string, age int) (afterTenTearsAge int, afterTwentyYearsAge int) { //declare return variable, just assign value
	fmt.Println("Hello", fname, " Refsnes age", age)
	afterTenTearsAge = age + 10
	afterTwentyYearsAge = age + 20
	return
}

func fibonacci(count int) (value int) {
	if count == 1 || count == 2 {
		return 1
	} else {
		return fibonacci(count-1) + fibonacci(count-2) //recursive
	}
}

type Person struct {
	name string
	age  int
}

func printPerson(per Person) {
	fmt.Println(per.name)
}
