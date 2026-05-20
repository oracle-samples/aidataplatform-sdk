# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RenameTableFieldDetails(object):
    """
    Details for renaming column of a table.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RenameTableFieldDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param field_name:
            The value to assign to the field_name property of this RenameTableFieldDetails.
        :type field_name: str

        :param updated_field_name:
            The value to assign to the updated_field_name property of this RenameTableFieldDetails.
        :type updated_field_name: str

        """
        self.swagger_types = {
            'field_name': 'str',
            'updated_field_name': 'str'
        }

        self.attribute_map = {
            'field_name': 'fieldName',
            'updated_field_name': 'updatedFieldName'
        }

        self._field_name = None
        self._updated_field_name = None

    @property
    def field_name(self):
        """
        **[Required]** Gets the field_name of this RenameTableFieldDetails.
        Name of the column.


        :return: The field_name of this RenameTableFieldDetails.
        :rtype: str
        """
        return self._field_name

    @field_name.setter
    def field_name(self, field_name):
        """
        Sets the field_name of this RenameTableFieldDetails.
        Name of the column.


        :param field_name: The field_name of this RenameTableFieldDetails.
        :type: str
        """
        self._field_name = field_name

    @property
    def updated_field_name(self):
        """
        **[Required]** Gets the updated_field_name of this RenameTableFieldDetails.
        Updated name of the column.


        :return: The updated_field_name of this RenameTableFieldDetails.
        :rtype: str
        """
        return self._updated_field_name

    @updated_field_name.setter
    def updated_field_name(self, updated_field_name):
        """
        Sets the updated_field_name of this RenameTableFieldDetails.
        Updated name of the column.


        :param updated_field_name: The updated_field_name of this RenameTableFieldDetails.
        :type: str
        """
        self._updated_field_name = updated_field_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
