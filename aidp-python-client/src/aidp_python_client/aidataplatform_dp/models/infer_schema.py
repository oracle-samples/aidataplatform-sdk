# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class InferSchema(object):
    """
    Inferred schema from location.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new InferSchema object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param infer_schema_column:
            The value to assign to the infer_schema_column property of this InferSchema.
        :type infer_schema_column: list[oci.aidataplatform_dp.models.InferSchemaColumn]

        """
        self.swagger_types = {
            'infer_schema_column': 'list[InferSchemaColumn]'
        }

        self.attribute_map = {
            'infer_schema_column': 'inferSchemaColumn'
        }

        self._infer_schema_column = None

    @property
    def infer_schema_column(self):
        """
        **[Required]** Gets the infer_schema_column of this InferSchema.
        Column information obtained by inferring schema.


        :return: The infer_schema_column of this InferSchema.
        :rtype: list[oci.aidataplatform_dp.models.InferSchemaColumn]
        """
        return self._infer_schema_column

    @infer_schema_column.setter
    def infer_schema_column(self, infer_schema_column):
        """
        Sets the infer_schema_column of this InferSchema.
        Column information obtained by inferring schema.


        :param infer_schema_column: The infer_schema_column of this InferSchema.
        :type: list[oci.aidataplatform_dp.models.InferSchemaColumn]
        """
        self._infer_schema_column = infer_schema_column

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
