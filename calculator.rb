require "active_support/all"
puts"Enter your first number(cannot be 0):"
first_num = STDIN.gets.to_i

loop do 
    if first_num == 0
    puts 'Invalid number'
    first_num = STDIN.gets.to_i
    else 
        break
    end
end
puts"Enter an operator: (*, /, +, -)"

operators = [ '*' , '/', '+', '-']
method = STDIN.gets.chomp
valid2 = method.in?(operators)

loop do
    if valid2 == false
    puts 'Invalid operator'
    method = STDIN.gets.chomp
    valid2 = method.in?(operators)
    else
        break
    end
end
puts"Enter your second number (cannot be 0):"

second_num = STDIN.gets.to_i

loop do 
    if second_num == 0
    puts 'Invalid number'
    second_num = STDIN.gets.to_i
    else 
        break
    end
end

if method == operators[0]
puts "#{first_num} multiplied by #{second_num} is #{first_num * second_num}"
elsif method == operators[1]
    puts "#{first_num} divided by #{second_num} is #{first_num / second_num}"
elsif method == operators[2]
    puts "#{first_num} plus #{second_num} is #{first_num + second_num}"
else method == operators[3]
    puts "#{first_num} minus #{second_num} is #{first_num - second_num}"
end
