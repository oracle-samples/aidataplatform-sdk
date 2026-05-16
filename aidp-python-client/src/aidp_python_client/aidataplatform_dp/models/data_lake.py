# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DataLake(object):
    """
    A DataLake is a description of a DataLake.

    To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to
    an administrator. If you're an administrator who needs to write policies to give users access, see
    `Getting Started with Policies`__.

    __ https://docs.cloud.oracle.com/iaas/Content/Identity/policiesgs/get-started-with-policies.htm
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DataLake object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        """
        self.swagger_types = {
            
        }

        self.attribute_map = {
            
        }

        

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
