package com.rock.yacht;

public class A02_InheritAndOverride {
    public static void main(String[] args) {
        class Sports {
            String getName(){
                return "Generic Sports";
            }

            void getNumberOfTeamMembers() {
                System.out.println( "Each team has n players in " + getName() );
            }
        }

        class Soccer extends Sports {
            String getName() {
                return "Soccer Class";
            }

            @Override
            void getNumberOfTeamMembers() {
                System.out.println( "Each team has 11 players in " + getName() );
            }
        }
        Sports sports = new Sports();
        Soccer soccer = new Soccer();
        System.out.println(sports.getName());
        sports.getNumberOfTeamMembers();
        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();
    }
}
