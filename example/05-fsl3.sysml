bdd [package] fsl3::acs [ACS]
-----------------------------------------------------------

block Building
  references
    gate: Building[*] <- building
      derive: org_dom.dest->asSet()
    building: Building[*] <- gate
    org_dom: Door[*] <- org
  constraints
    inv: not (gate->includes(self))

block Person
  references
    aut: Building[*]
    sit: Building[1] { subsets aut }
  constraints
    inv: aut->forAll(b|aut.building->includes(b))

block Door
  operations
    enter(p: Person)
      pre: p.aut->includes(dest)
      pre: p.sit = org
      post: p.sit = dest
  references
    org:  Building[1] <- org_dom
    dest: Building[1]
  owned behaviors
    state machine EnterBehavior <|- enter
      initial state Waiting
        enter / -> Waiting