function missingValues(a) {
    const x = a.find( v => a.filter( w => v===w ).length===1 );
    const y = a.find( v => a.filter( w => v===w ).length===2 );
    return x*x*y;
  }