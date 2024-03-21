puts "Company Email Generator"
print "First Name: "
name = STDIN.gets.chomp
print "Last Name: "
lastname = STDIN.gets.chomp
print "company: "
company = STDIN.gets.chomp


email = ""
email << name.downcase.split.join(".")
email << "."
email << lastname.downcase.split.join(".")
email << "@"
email << company.downcase.split.join
email << ".com"

puts email
