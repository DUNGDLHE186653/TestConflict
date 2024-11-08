import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val manager = StudentManager()

    loop@ while (true) {
        println(
            """
            |--- Student Management Menu ---|
            |1. View all students
            |2. Add student(s)
            |3. Update student
            |4. Delete student
            |5. Exit
            |Enter your choice:
        """.trimMargin()
        )
        when (scanner.nextInt()) {
            1 -> manager.viewAllStudents()
            2 -> {
                println("Enter the number of students to add:")
                val count = scanner.nextInt()
                if (count > 0) {
                    manager.addStudents(count)
                } else {
                    println("Please enter a positive number.")
                }
            }
            3 -> {
                println("Enter the student ID to update:")
                val id = scanner.nextInt()
                manager.updateStudent(id)
            }
            4 -> {
                println("Enter the student ID to delete:")
                val id = scanner.nextInt()
                manager.deleteStudent(id)
            }
            5 -> break@loop
            else -> println("Invalid choice. Please try again.")
        }
    }
    scanner.close()
    println("Exiting Student Management System.")
}