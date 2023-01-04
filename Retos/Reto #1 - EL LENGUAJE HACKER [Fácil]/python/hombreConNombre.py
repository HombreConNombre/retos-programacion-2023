letra_a_leet = {
    'a' : '4',
    'b' : "I3",
    'c' : '[',
    'd' : ')',
    'e' : '3',
    'f' : "|=",
    'g' : '&',
    'h' : '#',
    'i' : '1',
    'j' : ",_|",
    'k' : ">|",
    'l' : '1',
    'm' : "/\/\'",
    'n' : "^/",
    'ñ' : '~',
    'o' : '0',
    'p' : "|*",
    'q' : "(_,)",
    'r' : "I2",
    's' : '5',
    't' : '7',
    'u' : "(_)",
    'v' : "\/",
    'w' : "\/\/",
    'x' : "><",
    'y' : 'j',
    'z' : '2',
    ' ' : ' ',
    ',' : ',',
    '.' : '.',
    '!' : '!',
    '¡' : '¡',
    '?' : '?',
    '¿' : '¿'
}
    
def String_to_Leet( Pretraduccion):
    Char_array = [letra for letra in Pretraduccion.lower()]
    Leet_string = ''
    for x in Char_array:
        Leet_string +=  letra_a_leet[ x]
    print( Leet_string)


String_to_Leet('Buenos dias, vamos a preparar el primer mensaje LEET')
