# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AccessGrantedForDatalakeDetails(object):
    """
    Lakeproxy Datalake resource details.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AccessGrantedForDatalakeDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param datalake_id:
            The value to assign to the datalake_id property of this AccessGrantedForDatalakeDetails.
        :type datalake_id: str

        """
        self.swagger_types = {
            'datalake_id': 'str'
        }
        self.attribute_map = {
            'datalake_id': 'datalakeId'
        }
        self._datalake_id = None

    @property
    def datalake_id(self):
        """
        **[Required]** Gets the datalake_id of this AccessGrantedForDatalakeDetails.
        Lakeproxy datalakeId.


        :return: The datalake_id of this AccessGrantedForDatalakeDetails.
        :rtype: str
        """
        return self._datalake_id

    @datalake_id.setter
    def datalake_id(self, datalake_id):
        """
        Sets the datalake_id of this AccessGrantedForDatalakeDetails.
        Lakeproxy datalakeId.


        :param datalake_id: The datalake_id of this AccessGrantedForDatalakeDetails.
        :type: str
        """
        self._datalake_id = datalake_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
