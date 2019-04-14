class Mammal 
    def breathe 
        puts "Breathe"
    end 
end

class Cat < Mammal
    def speak 
        puts "Meow"
    end 
end 

# for overridding, just re-define the function

def func 
    10.times do |num|
        square = num*num 
        return num, square if num > 5 
    end 
end 

num, square = func
puts num
puts square