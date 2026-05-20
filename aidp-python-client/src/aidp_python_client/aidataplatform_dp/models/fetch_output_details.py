# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class FetchOutputDetails(object):
    """
    The payload to fetch TaskRunOutput.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new FetchOutputDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param output_key:
            The value to assign to the output_key property of this FetchOutputDetails.
        :type output_key: str

        """
        self.swagger_types = {
            'output_key': 'str'
        }

        self.attribute_map = {
            'output_key': 'outputKey'
        }

        self._output_key = None

    @property
    def output_key(self):
        """
        Gets the output_key of this FetchOutputDetails.
        A unique identifier for the output.


        :return: The output_key of this FetchOutputDetails.
        :rtype: str
        """
        return self._output_key

    @output_key.setter
    def output_key(self, output_key):
        """
        Sets the output_key of this FetchOutputDetails.
        A unique identifier for the output.


        :param output_key: The output_key of this FetchOutputDetails.
        :type: str
        """
        self._output_key = output_key

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
