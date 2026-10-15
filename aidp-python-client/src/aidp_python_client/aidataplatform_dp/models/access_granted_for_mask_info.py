# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AccessGrantedForMaskInfo(object):
    """
    Mask expressions returned by Lakeproxy, preserved verbatim.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AccessGrantedForMaskInfo object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param mask_type:
            The value to assign to the mask_type property of this AccessGrantedForMaskInfo.
        :type mask_type: str

        :param mask_condition:
            The value to assign to the mask_condition property of this AccessGrantedForMaskInfo.
        :type mask_condition: str

        :param masked_value:
            The value to assign to the masked_value property of this AccessGrantedForMaskInfo.
        :type masked_value: str

        """
        self.swagger_types = {
            'mask_type': 'str',
            'mask_condition': 'str',
            'masked_value': 'str'
        }
        self.attribute_map = {
            'mask_type': 'maskType',
            'mask_condition': 'maskCondition',
            'masked_value': 'maskedValue'
        }
        self._mask_type = None
        self._mask_condition = None
        self._masked_value = None

    @property
    def mask_type(self):
        """
        Gets the mask_type of this AccessGrantedForMaskInfo.
        Ranger mask type.


        :return: The mask_type of this AccessGrantedForMaskInfo.
        :rtype: str
        """
        return self._mask_type

    @mask_type.setter
    def mask_type(self, mask_type):
        """
        Sets the mask_type of this AccessGrantedForMaskInfo.
        Ranger mask type.


        :param mask_type: The mask_type of this AccessGrantedForMaskInfo.
        :type: str
        """
        self._mask_type = mask_type

    @property
    def mask_condition(self):
        """
        Gets the mask_condition of this AccessGrantedForMaskInfo.
        Mask condition, including an empty string or null.


        :return: The mask_condition of this AccessGrantedForMaskInfo.
        :rtype: str
        """
        return self._mask_condition

    @mask_condition.setter
    def mask_condition(self, mask_condition):
        """
        Sets the mask_condition of this AccessGrantedForMaskInfo.
        Mask condition, including an empty string or null.


        :param mask_condition: The mask_condition of this AccessGrantedForMaskInfo.
        :type: str
        """
        self._mask_condition = mask_condition

    @property
    def masked_value(self):
        """
        Gets the masked_value of this AccessGrantedForMaskInfo.
        Mask value or SQL expression, including an empty string or null.


        :return: The masked_value of this AccessGrantedForMaskInfo.
        :rtype: str
        """
        return self._masked_value

    @masked_value.setter
    def masked_value(self, masked_value):
        """
        Sets the masked_value of this AccessGrantedForMaskInfo.
        Mask value or SQL expression, including an empty string or null.


        :param masked_value: The masked_value of this AccessGrantedForMaskInfo.
        :type: str
        """
        self._masked_value = masked_value

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
