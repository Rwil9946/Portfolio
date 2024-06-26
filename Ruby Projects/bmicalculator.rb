puts "Body Mass Index Categories"
puts "Severely Thin <16"
puts "Moderately Thin 16-17"
puts "Mildly Thin 17-18.5"
puts "Normal 18.5-25"
puts "Overweight 25-30"
puts "Obese Class I 30-35"
puts "Obese Class II 35-40"
puts "Obese Class III >40"

puts "BMI Calculator"
print "Height(ft): "
feet = STDIN.gets.chomp.to_f
print "Height(in): "
inches = STDIN.gets.chomp.to_f
height = (feet * 12) + inches
print "Weight(lbs): "
weight = STDIN.gets.chomp.to_f
bmi = weight / (height ** 2) * 703
bmi.round(2)
print "BMI = #{bmi.round(2)}"
