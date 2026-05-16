# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AiDataPlatform(object):
    """
    An AiDataPlatform is a unified platform for lifecycle management and governance of data and AI objects.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AiDataPlatform object with values from keyword arguments.
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
