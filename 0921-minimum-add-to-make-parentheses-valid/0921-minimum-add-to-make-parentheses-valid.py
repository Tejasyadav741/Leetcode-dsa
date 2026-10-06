class Solution(object):
    def minAddToMakeValid(self, s):
        open_needed = 0  # Count of orphaned ')' that strictly need a '(' added
        close_needed = 0 # Count of orphaned '(' that strictly need a ')' added
        
        for char in s:
            if char == '(':
                close_needed += 1
            else:
                # It's a ')'
                if close_needed > 0:
                    # We have a matching '(' available to pair with this!
                    close_needed -= 1
                else:
                    # No '(' available. This ')' is orphaned.
                    open_needed += 1
                    
        return open_needed + close_needed
        """
        :type s: str
        :rtype: int
        """
        