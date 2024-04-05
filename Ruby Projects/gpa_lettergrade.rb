print "Enter Grade Point: "
grade = STDIN.gets.chomp.to_i

result = case grade
when 90..100 then "Letter Grade A"
when 80...90 then "Letter Grade B"
when 70...80 then "Letter Grade C"
when 60...70 then "Letter Grade D"
when 0...60 then "Letter Grade F"
else "Invalid Input"
end

puts result
