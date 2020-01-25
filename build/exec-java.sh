
    #!/bin/bash
    # Basic while loop
    counter=1
    while [ $counter -le 1000 ]
    do
    java -jar ../our-java/SoftwareReliability.jar
    ((counter++))
    done
    echo All done

